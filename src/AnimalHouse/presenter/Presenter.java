package AnimalHouse.presenter;

import AnimalHouse.model.service.Service;
import AnimalHouse.model.writer.Writable;
import AnimalHouse.view.View;

public class Presenter {


    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void setWritable(Writable writable) {
        service.setWritable(writable);
    }


}
