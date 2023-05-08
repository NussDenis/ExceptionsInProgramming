package HomeWorkSeminar_3.base.interfaces;

import HomeWorkSeminar_3.base.exceptions.GetDataException;

import java.io.IOException;

public interface IGetData {
    public String getData() throws IOException;
}