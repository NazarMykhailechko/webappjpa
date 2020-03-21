package webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import webapplication.dao.ClientDao;
import webapplication.model.Client;

@Controller
public class ClientController {

    @Autowired
    ClientDao clientDao;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showNewClientPage(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);
        return "WEB-INF/new_client";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveClient(@ModelAttribute("client") Client client) {
        clientDao.save(client);
        return "redirect:/";
    }


    @RequestMapping(value = "/")
    public String home(Model model) {
        model.addAttribute("listOfClients", clientDao.findAll());

        for (Client cl : clientDao.findAll()) {
            System.out.print(cl.toString());
        }
        return "index";
    }


}
