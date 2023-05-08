package HomeWorkSeminar_3.base.abstractClasses;

import HomeWorkSeminar_3.base.classes.workWithFile.CFileCreator;
import HomeWorkSeminar_3.base.classes.workWithFile.CFindTheSameFileName;
import HomeWorkSeminar_3.base.interfaces.IWriteToFile;

import java.io.FileWriter;

public abstract class AFileWriter implements IWriteToFile {
    protected FileWriter fileWriter;
    protected CFileCreator fileCreator;
    protected CFindTheSameFileName findTheSameFileName;
}