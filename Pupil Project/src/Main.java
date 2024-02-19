public class Main {

    public static void main(String[] args) {

        final PupilService pupilService = new PupilService();

        Pupil pupil = new Pupil("Mohammad", "Mohammadi", 26, 20);
        System.out.println(pupil);
        pupilService.create(pupil);
        System.out.println(pupil + " " + pupilService.pupilList.size());

    Pupil readpupil = pupilService.read("Mohammadi");
        System.out.println(readpupil);

        pupilService.update("Mohammadi", 17.25);
        Pupil updatedpupil = pupilService.read("Mohammadi");
        System.out.println(updatedpupil);

        pupilService.delete("Mohammadi");
        System.out.println(pupilService.pupilList.size());

    }
}
