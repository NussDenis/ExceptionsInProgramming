package HomeWorkSeminar_3.base.interfaces;

import HomeWorkSeminar_3.base.exceptions.MyFileCreateException;
import HomeWorkSeminar_3.base.exceptions.TheSameFileWritingException;

public interface IWriteToFile {
    public boolean writeToFile(String[] infoToWrite) throws TheSameFileWritingException, MyFileCreateException;
}