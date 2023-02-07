package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                    "<li>Java</li>" +
                    "<li>JavaScript</li>" +
                    "<li>Python</li>" +
                "</ol>" +
                "</html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String form() {
        return "<html>" +
                "<body>" +
                "<form action='/form' method='post'>" + //submit a request to /hello
                "<label>Name:<br>" +
                "<input type='text' name='name'/><br>" +

                "<label>My favorite language:<br>" +
                "<select name = firstChoice>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label><br>" +

                "<label>My second favorite language:<br>" +
                "<select name = secondChoice>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label><br>" +

                "<label>My third favorite language:<br>" +
                "<select name = thirdChoice>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label><br>" +

                "<input type='submit' value='Submit'/><br>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    @ResponseBody
    public String showResult(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>";
    }

    @GetMapping("/table")
    @ResponseBody
    public String table() {
        return "<html>" +
                "<body>" +
                "<form action='/table' method='post'>" + //submit a request to /hello

                "<label>Name:<br>" +
                "<input type='text' name='name'/><br>" +

                "<table style='border: 1px solid'>" +
                "<tr>" +
                    "<th style='border: 1px solid'>Rank</th>" +
                    "<th style='border: 1px solid'>Language</th>" +
                "</tr>" +

                "<tr>" +
                    "<td style='border: 1px solid'>My favorite language</td>" +
                    "<td style='border: 1px solid'>" +
                        "<select name='firstChoice'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "</select>" +
                    "</td>" +
                "</tr>" +

                "<tr>" +
                "<td style='border: 1px solid'>My second favorite language</td>" +
                "<td style='border: 1px solid'>" +
                "<select name='secondChoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</td>" +
                "</tr>" +

                "<tr>" +
                "<td style='border: 1px solid'>My third favorite language</td>" +
                "<td style='border: 1px solid'>" +
                "<select name='thirdChoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</td>" +
                "</tr>" +

                "</table>" +

                "<input type='submit' value='Submit'/><br>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/table")
    @ResponseBody
    public String showResultInTable(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>";
    }

}
