package controller;

import model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.PostService;

import java.util.ArrayList;
import model.User;



@Controller
public class UserController {

    @Autowired
    private PostService postService;

    @RequestMapping("users/login")
    public String login(){

        return "users/login";
    }
    @RequestMapping("users/registration")
    public String registration() {

        return "users/registration";
    }
    @RequestMapping(value = "users/registration", method= RequestMethod.POST)
    public String registerUser(User user) {

        return "users/login";
    }
        @RequestMapping(value = "users/login", method=RequestMethod.POST)
        public String loginUser(User user){
            return "redirect:/posts";
        }
        @RequestMapping(value = "users/logout", method=RequestMethod.POST)
        public String logout(Model model){
            ArrayList<Post> posts = postService.getAllPosts();

            model.addAttribute("posts",posts);

            return "index";

        }
    }

