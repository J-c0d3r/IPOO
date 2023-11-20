package gympower;

import br.inatel.GymPower.view.InicioMDI;

import br.inatel.GymPower.DAO.*;
import br.inatel.GymPower.controller.*;
import br.inatel.GymPower.model.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GymPower {

    public static void main(String[] args) {

        InicioMDI inicio = new InicioMDI();
        inicio.setVisible(true);

    }

}
