package com.gmail.ksenzhuk_maksim.lesson3.task2;

public class ATM implements WithdrawFunction{

    private int bill_20 = 20;
    private int bankNotes20InATM;
    private int bill_50 = 50;
    private int bankNotes50InATM;
    private int bill_100 = 100;
    private int bankNotes100InATM;

    public ATM() {}

    public ATM(int bankNotes20, int bankNotes50, int bankNotes100) {
        if (bankNotes20 < 0 || bankNotes50 < 0 ||  bankNotes100 < 0) {
            System.out.println("Amount of banknotes shouldn't be less than 0");
            return;
        }
        this.bankNotes20InATM = bankNotes20;
        this.bankNotes50InATM = bankNotes50;
        this.bankNotes100InATM = bankNotes100;
    }

    void addBankNotes20(int amountBankNotes20) {
        if (amountBankNotes20 < 0) {
            System.out.println("Error: Your amount to refill should be more then zero");
            return;
        }
        this.bankNotes20InATM += amountBankNotes20;
    }
    public int getBankNotes20InATM() {
        return bankNotes20InATM;
    }

    void addBankNotes50(int amountBankNotes50) {
        if (amountBankNotes50 < 0) {
            System.out.println("Error: Your amount to refill should be more then zero");
            return;
        }
        this.bankNotes50InATM += amountBankNotes50;
    }
    public int getBankNotes50InATM() {
        return bankNotes50InATM;
    }

    void addBankNotes100(int amountBankNotes100) {
        if (amountBankNotes100 < 0) {
            System.out.println("Error: Your amount to refill should be more then zero");
            return;
        }
        this.bankNotes100InATM += amountBankNotes100;
    }
    public int getBankNotes100InATM() {
        return bankNotes100InATM;
    }

    int amountOfMoneyInATM() {
        return getBankNotes20InATM() * bill_20 + getBankNotes50InATM() * bill_50 + getBankNotes100InATM() * bill_100;
    }

    @Override
    public boolean withdrawMoney(int amountToWithdraw) {
        boolean isSuccessful = false;
        if (amountToWithdraw < 0) {
            System.out.println("Error occurred: amount for withdraw should be positive");
            return isSuccessful;
        } else if (amountToWithdraw > amountOfMoneyInATM()) {
            System.out.println("Not enough money in ATM, select another amount");
            return isSuccessful;
        } else if (amountToWithdraw == 0) {
            System.out.println("Your can't withdraw 0 in ATM");
            return false;
        } else isSuccessful = calculateBankNotesToWithDraw(amountToWithdraw);
        return isSuccessful;
    }

    private boolean calculateBankNotesToWithDraw(int amountToWithdraw) {
        int tempAmountToWithdraw = amountToWithdraw;

        int amountOf100BillToWithdraw = countBillsToWithDraw(amountToWithdraw, bill_100, bankNotes100InATM);
        this.bankNotes100InATM -= amountOf100BillToWithdraw;
        tempAmountToWithdraw = countRemainAmountToWithdraw(amountToWithdraw, amountOf100BillToWithdraw, bill_100);

        int amountOf50BillToWithdraw = countBillsToWithDraw(tempAmountToWithdraw, bill_50, bankNotes50InATM);
        this.bankNotes50InATM -= amountOf50BillToWithdraw;
        tempAmountToWithdraw = countRemainAmountToWithdraw(tempAmountToWithdraw, amountOf50BillToWithdraw, bill_50);

        int amountOf20BillToWithdraw = countBillsToWithDraw(tempAmountToWithdraw, bill_20, bankNotes20InATM);
        this.bankNotes20InATM -= amountOf20BillToWithdraw;
        tempAmountToWithdraw = countRemainAmountToWithdraw(tempAmountToWithdraw, amountOf20BillToWithdraw, bill_20);

        if (tempAmountToWithdraw == 0) {
            System.out.printf("Please get Your money\n" +
                    "your sum %d consist of following amount of banknotes\n" +
                    "20 - %d, 50 - %d, 100 - %d\n",amountToWithdraw, amountOf20BillToWithdraw, amountOf50BillToWithdraw,
                    amountOf100BillToWithdraw);
            return true;
        } else System.out.printf("You can't get current sum with this banknotes:\n" +
                "available banknotes in ATM %d, %d, %d\n", bill_20, bill_50, bill_100);
        return false;
    }

    private int countBillsToWithDraw(int amountToWithdraw, int bill, int bankNotesInAtmForCurrentBill) {
        int countOfBills = amountToWithdraw / bill;
        if (countOfBills > bankNotesInAtmForCurrentBill) {
            return countOfBills = bankNotesInAtmForCurrentBill;
        } else return countOfBills;
    }

    private int countRemainAmountToWithdraw(int amountToWithdraw, int amountOfBillToWithdraw, int bill) {
        return amountToWithdraw - amountOfBillToWithdraw * bill;
    }

    @Override
    public String toString() {
        return "Bank notes in ATM: " +
                "[20 banknotes qty: " + bankNotes20InATM +
                ", 50 banknotes qty: " + bankNotes50InATM +
                ", 100 banknotes qty: " + bankNotes100InATM + "]";
    }
}
