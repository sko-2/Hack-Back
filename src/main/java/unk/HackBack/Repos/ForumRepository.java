package unk.HackBack.Repos;

import org.springframework.data.repository.CrudRepository;
import unk.HackBack.Entities.Profile;

import javax.persistence.Table;

@Table(name = "Profile")
public interface ProfileRepository extends CrudRepository<Profile, Integer> {
}
