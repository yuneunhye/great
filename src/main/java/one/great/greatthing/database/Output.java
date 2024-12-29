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
        Record record=new Record();
        record.setPosNo("1");
    }

}
