package days;


public enum Days {

    DUISHOMBY("okuibuz, tehnical english sabagy bolot"),
    SHEISHEMBI("okuibuz practica sabagy bolot"),
    SHARSHENBI("okuibuz, teoria sbsgy bolot"),
    BEISHEMBI("okuibuz soft skils sabagy bolot"),
    ZHUMA("okuibuz event sabagy bbolot"),
    ISHEMBI("dem alysh, kampuska kelsek bolot"),
    JEKSHEMBI("dem alysh, kampuska kelbeibiz");
    final String kundor;


    Days(String kundor) {
        this.kundor = kundor;
    }

    public String getKundor() {
        return kundor;
    }

    }

