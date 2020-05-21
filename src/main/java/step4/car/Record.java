package step4.car;

import java.util.List;

public class Record {

    private final List<Trace> traces;

    public Record(List<Trace> record) {
        this.traces = record;
    }

    public List<Trace> getTraces() {
        return traces;
    }
}