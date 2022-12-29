package com.backend.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.backend.Entity.Admin;
import com.backend.Entity.Bid;
import com.backend.Service.AdminService;
import com.backend.Service.BidService;

@Controller
public class BidController {
	@Autowired
	 BidService bidService;

	@GetMapping("/bid")
    public String bid(Model model) {

        model.addAttribute("bid", new Bid());
        return "bid";
    }

    @PostMapping("/bid")
    public String bid(@ModelAttribute Bid bid, Model model, HttpSession session) {

        Bid loggedInBid = bidService.createBid(bid);

        if(loggedInBid != null) {
            session.setAttribute("loggedInBidId", loggedInBid.getId());

            model.addAttribute("loggedInBid", loggedInBid);

            return "bid";
        } else {
            model.addAttribute("message", "You don't have an account.");
            return "Home";
        }

    }
    


}
