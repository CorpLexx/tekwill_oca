package frecventa.impl;

import frecventa.api.Presence;
public class Lesson {
    private Group group;
    private Presence presence;

    public Lesson(Group group) {
        this.group = group;
        this.presence = new PresenceImpl(group);
    }

    public void start() {
        presence.check();
    }

    public void print(){
        System.out.println();
        for (Staff staff : group.getAllStaff()){
            if (presence.isPresent(staff))
                System.out.println(staff);
        }
    }
}
