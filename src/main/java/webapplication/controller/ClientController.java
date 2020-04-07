package webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import webapplication.dao.ClientDao;
import webapplication.model.Client;

import java.io.IOException;

@Controller
@RequestMapping("/")
public class ClientController {

    @Autowired
    ClientDao clientDao;

    @Autowired
    private Environment environment;

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
//        System.out.println(request.getRemoteAddr());
//        String userlogin = System.getenv("username");
//        Map<String, String> userlogin1 = System.getenv();
//        InetAddress InetAddress = java.net.InetAddress.getLoopbackAddress();
//        String sysss = System.getProperty("user.name");
//        Runtime r = Runtime.getRuntime();
//        Process p = r.exec("whoami");
//        BufferedReader rr = new BufferedReader(new InputStreamReader(p.getInputStream()));
//        System.out.println(rr.readLine());
//        String remoteAddr = request.getHeader("REMOTE_ADDR");
//        model.addAttribute("userlogin", remoteAddr);
        model.addAttribute("listOfClients", clientDao.findAll());

//        for (Client cl : clientDao.findByUserlogin(System.getenv("username"))) {
//            System.out.print(cl.toString());
//        }

        return "index";
    }

}
