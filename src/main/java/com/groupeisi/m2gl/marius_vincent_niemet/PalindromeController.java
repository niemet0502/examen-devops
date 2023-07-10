package com.groupeisi.m2gl.marius_vincent_niemet;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/checkpalindrome")
public class PalindromeController {

    @PostMapping("/")
    public PalindromeOutput checkpalindrome(@RequestBody PalindromeInput palindrome) {
        String mot = palindrome.getMotAVerifier();

        int l = 0;
        int r = mot.length() - 1;

        while (l < r){
            if(mot.charAt(l) != mot.charAt(r)){
                PalindromeOutput output = new PalindromeOutput();
                output.setIsPalindrome(false);
                return output;
            }

            l++;
            r--;
        }

        PalindromeOutput output = new PalindromeOutput();
        output.setIsPalindrome(true);
        return output;
    }
}
