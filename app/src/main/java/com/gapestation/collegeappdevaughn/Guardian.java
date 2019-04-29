package com.gapestation.collegeappdevaughn;

public class Guardian extends FamilyMember{
    String mLastName;
    String mFirstName;
    String mOccupation;
    String mObjectId;

    @Override
    public String getLastName() {
        return mLastName;
    }

    @Override
    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    @Override
    public String getFirstName() {
        return mFirstName;
    }

    @Override
    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public Guardian(String firstName, String lastName){
        super(firstName, lastName);
        mOccupation = "classified";
    }

    public Guardian(){
        super();
        mOccupation = "classified";
    }

    public Guardian(String firstName, String lastName, String occupation){
        mFirstName = firstName;
        mLastName = lastName;
        mOccupation = occupation;
    }

    @Override
    public String toString(){
        return("Guardian: " + mFirstName + " " + mLastName + "\n Occupation: " + mOccupation);
    }

    public void setObjectId(String objectId) {
        mObjectId = objectId;
    }

    public String getObjectId() {
        return mObjectId;
    }

}

