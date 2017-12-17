package frecventa.impl;

import frecventa.api.Character;
import frecventa.api.Presence;

import java.util.ArrayList;
import java.util.List;

public class PresenceImpl implements Presence {

    private Group group;
    private List<Staff> presenceStaff;

    public PresenceImpl(Group group) {
        this.group = group;
        presenceStaff = new ArrayList<>();

    }

    @Override
    public boolean isPresent(Character character) {
        return presenceStaff.contains(character);
    }

    @Override
    public void check() {
        group.students().
                forEach(s -> {
                    if (Math.random() > 0.3)
                        presenceStaff.add(s);
                });
    }


}
