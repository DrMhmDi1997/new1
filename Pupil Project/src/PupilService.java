import java.util.ArrayList;
import java.util.List;

public class PupilService {

    public List<Pupil> pupilList = new ArrayList<>();

    public void create(Pupil newpupil) {
        pupilList.add(newpupil);
    }
    public Pupil read(String lastName) {
        for (Pupil pupil:this.pupilList) {
            if (pupil.getLastName() == lastName) {
                return pupil;
            }
        }
        return null;
    }

    public void update (String lastName, double score) {
        for (Pupil pupil:this.pupilList) {
            if (pupil.getLastName() == lastName) {
                pupil.setScore(score);
            }
        }
    }

    public void delete(String lastName) {
        for (int i = 0; i < this.pupilList.size(); i++) {
            if (pupilList.get(i).getLastName() == lastName) {
                pupilList.remove(i);
            }
        }
    }
}
