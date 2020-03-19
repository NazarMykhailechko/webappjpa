package webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import webapplication.dao.ClientDao;
import webapplication.model.Client;

@Controller
public class ClientController {

    @Autowired
    ClientDao clientDao;

    @RequestMapping("/add")
    public String showNewClientPage(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);
        return "new_client";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveClient(@ModelAttribute("client") Client client) {
        clientDao.save(client);
        return "redirect:/";
    }


    @RequestMapping("/")
    public String home(Model model, @ModelAttribute("client") Client client) {
        model.addAttribute("listOfClients", clientDao.findAll());
        if(client.getName()!=null){
            clientDao.save(client);
        }

        for (Client cl : clientDao.findAll()) {
            System.out.print(cl.toString());
        }
        return "index";
    }


}
