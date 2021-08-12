package ro.siit.session17;

import java.util.Objects;

public class ManyMembersType {
    private String m1; // a   // a
    private String m2;// a   // a
    private String m3;// a   // a
    private String m4;// a   // a
    private String m5;// a   // a
    private String m6;// a   // a
    private String m7;// a   // a
    private String m8;// a   // a
    private String m9;// a   // b

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManyMembersType that = (ManyMembersType) o;
        return m1.equals(that.m1) && m2.equals(that.m2) && m3.equals(that.m3) && m4.equals(that.m4) && m5.equals(that.m5) && m6.equals(that.m6) && m7.equals(that.m7) && m8.equals(that.m8) && m9.equals(that.m9);
    }

    @Override
    public int hashCode() {
        return Objects.hash(m1, m2, m3, m4, m5, m6, m7, m8, m9);
    }
}
