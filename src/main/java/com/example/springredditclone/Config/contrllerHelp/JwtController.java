package com.example.springredditclone.Config.contrllerHelp;
import com.example.springredditclone.Config.JwtUtil;
import com.example.springredditclone.Config.modelHelp.JwtRequest;
import com.example.springredditclone.Config.modelHelp.JwtResponse;
import com.example.springredditclone.Config.serviceHelp.CustomUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/st")
@CrossOrigin("*")
public class JwtController {


    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    CustomUserDetailService userDetailsService;

    @Autowired
    JwtUtil jwtUtil;

    @PostMapping("/generate-token")
    public ResponseEntity<?> gen(@RequestBody JwtRequest jwtRequest) throws Exception {
        try{
            System.out.print("yobro");
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(),jwtRequest.getPassword()));
        }
        catch (UsernameNotFoundException exception){
            throw new Exception("User not found"+exception);
        }
        //authencate
        UserDetails userDetails=userDetailsService.loadUserByUsername(jwtRequest.getUsername());
        String token=jwtUtil.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }

    @GetMapping("testop")
    public String op(){
        return "helllo motherfucker";
    }

}
