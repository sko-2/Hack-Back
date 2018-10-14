package unk.HackBack.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unk.HackBack.Entities.Profile;
import unk.HackBack.Models.ProfileModel;
import unk.HackBack.Repos.ProfileRepository;

@RestController
@RequestMapping("api/profiles/")
public class ProfileController {

    private ProfileRepository profileRepository;

    public ProfileController(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @GetMapping
    @RequestMapping(value = "{id}")
    public ProfileModel getProfile(@PathVariable(value = "id") String id) {

        Profile profile = profileRepository.findById(id).get();
        ProfileModel model = new ProfileModel(profile.getUserName(), profile.getFirstName(), profile.getLastName(), profile.getEmail(), profile.getBio(), profile.getDateOfBirth(), profile.getGender(), profile.getLanguage(), profile.getCity(), profile.getState());
        return model;
    }
}
