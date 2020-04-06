package webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import webapplication.dao.ClientDao;
import webapplication.model.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
@RequestMapping("/")
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
        String userlogin = System.getenv("username");
        client.setUserlogin(userlogin);
        clientDao.save(client);
        return "redirect:/";
    }

    @RequestMapping("/")
    public String home(Model model) throws IOException {
        String userlogin = System.getenv("username");
        InetAddress InetAddress = java.net.InetAddress.getLocalHost();

        Runtime r = Runtime.getRuntime();
        Process p = r.exec("hostname");
        BufferedReader rr = new BufferedReader(new InputStreamReader(p.getInputStream()));
        System.out.println(rr.readLine());

        model.addAttribute("listOfClients", clientDao.findByUserlogin(userlogin));
        model.addAttribute("userlogin", rr.readLine());

//        for (Client cl : clientDao.findByUserlogin(System.getenv("username"))) {
//            System.out.print(cl.toString());
//        }

        return "index";
    }

}
