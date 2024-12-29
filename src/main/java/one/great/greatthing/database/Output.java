package one.great.greatthing.database;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Output {

    List<Record> list=new ArrayList<>();

    public static void main(String[] args) {
        String val ="1";

        Record record = new Record();
        record.setPosNo(val);


        List<String> outputs = new ArrayList<>();
        outputs.add("Hello judyyyy");


    }
}
