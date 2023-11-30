package com.myplugin.plsqlic3.plugin.customlanguage.sql.inconsinfo;

import java.util.Objects;

public class InconsistencyInfo {
    int start_offset;
    int stop_offset;

    public InconsistencyInfo(int start_offset, int stop_offset) {
        this.start_offset = start_offset;
        this.stop_offset = stop_offset + 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        return start_offset == ((InconsistencyInfo) obj).start_offset &&
                stop_offset == ((InconsistencyInfo) obj).stop_offset;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start_offset, stop_offset);
    }
}
