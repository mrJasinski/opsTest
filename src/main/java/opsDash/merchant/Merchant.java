package opsDash.merchant;

import opsDash.employee.Employee;

public class Merchant
{
    private int id;
    private String number;
    private String email;
    private String status;  //enum? active/banned/blocked/inactive?
    private int daysToBlock;   // how many days merchant has to pay for car before block account-
    private int daysToBan;   // how many days merchant has to pay for car before block account-
    private boolean cashCompensationAllowed;
    private Employee salesRepresentative;
}
