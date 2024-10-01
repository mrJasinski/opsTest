package opsDash.claim;

import opsDash.vehicle.Vehicle;

class Claim
{
    private int id;
    private String number;
    private Vehicle vehicle;
    private int firstProposalAmount;
    private String firstProposalJustification;
    private int carExpertAmount;
    private String carExpertJustification;
    private int finalAmount;
    private int finalJustification;
    private int actualAmount;   // wartość bieżącej propozycji - przypierwszej decyzji przybiera wartość 1stProp jeśli CE zmieni to ceAmount a potem ew finalAmount

    private int actualMileage;
//    cmr placeholder - based on reasons?
//    car docs - based on reasons
//    claim reasons

}
