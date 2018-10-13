package unk.HackBack.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import unk.HackBack.Entities.Profile;

import javax.persistence.Table;

@Table(name = "Profile")
public interface ProfileRepository extends JpaRepository<Profile, String> {

    @Query(value = "SELECT UserName FROM Profile WHERE ProfileID = ?1", nativeQuery = true)
    String findUserNameByUserId(String userId);
}
