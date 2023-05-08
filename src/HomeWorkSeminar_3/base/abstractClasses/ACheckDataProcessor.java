package HomeWorkSeminar_3.base.abstractClasses;

import HomeWorkSeminar_3.base.interfaces.ICheckBirthday;
import HomeWorkSeminar_3.base.interfaces.ICheckFullName;
import HomeWorkSeminar_3.base.interfaces.ICheckQuantity;
import HomeWorkSeminar_3.base.interfaces.ICheckSex;

public abstract class ACheckDataProcessor implements ICheckFullName, ICheckQuantity, ICheckBirthday, ICheckSex {
    protected ACheckQuantity checkQuantity;
    protected ACheckFullName checkFullName;
    protected ACheckData checkBirthday;
    protected ACheckData checkSex;

    public ACheckDataProcessor(ACheckQuantity checkQuantity, ACheckFullName checkFullName, ACheckData checkBirthday, ACheckData checkSex) {
        this.checkQuantity = checkQuantity;
        this.checkFullName = checkFullName;
        this.checkBirthday = checkBirthday;
        this.checkSex = checkSex;
    }
}