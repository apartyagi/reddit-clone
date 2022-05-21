package com.example.springredditclone.Config.serviceHelp;

import com.example.springredditclone.Model.User;
import com.example.springredditclone.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
            User byUsername = userRepo.findByUsername(s);
            if (byUsername!=null){
             return new CustomUserDetail(byUsername);
            }
                throw new UsernameNotFoundException("not found user with this name");
    }
}
