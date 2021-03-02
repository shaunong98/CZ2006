package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class School implements Parcelable {

    private String imageUrl,schoolName, address, mission, vision;

    public School() {
    }

    protected School(Parcel in) {
        imageUrl = in.readString();
        schoolName = in.readString();
        address = in.readString();
        mission = in.readString();
        vision = in.readString();
    }

    public static final Creator<School> CREATOR = new Creator<School>() {
        @Override
        public School createFromParcel(Parcel in) {
            return new School(in);
        }

        @Override
        public School[] newArray(int size) {
            return new School[size];
        }
    };

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(imageUrl);
        dest.writeString(schoolName);
        dest.writeString(address);
        dest.writeString(mission);
        dest.writeString(vision);
    }
}
