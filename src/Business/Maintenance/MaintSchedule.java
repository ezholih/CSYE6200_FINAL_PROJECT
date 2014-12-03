/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Maintenance;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Martin
 */
public class MaintSchedule{
    
    private final int maintInterval;
    private Date lastMaintDate;
    private Date nextMaintDate;
    private UserAccount vender;
    private String problemDesp;
    private String fixDesp;
    private MaintType mType;

    public MaintSchedule(MaintType mtype, int interval) {
        this.mType = mtype;
        maintInterval = interval;
    }
    
    public MaintSchedule(MaintSchedule lastMaint){
        this.maintInterval = lastMaint.getMaintInterval();
        this.lastMaintDate = lastMaint.getLastMaintDate();
        this.nextMaintDate = lastMaint.getNextMaintDate();
        this.vender = lastMaint.getVender();
        this.problemDesp = lastMaint.getProblemDesp();
        this.fixDesp = lastMaint.getFixDesp();
        this.mType = lastMaint.getmType();
    }

    public enum MaintType{
        REG("Regular"),
        REP("Repair");
        
        private String value;
        private MaintType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        public String toString(){
            return value;
        }
    }

    public int getMaintInterval() {
        return maintInterval;
    }

    public Date getLastMaintDate() {
        return lastMaintDate;
    }

    public void setLastMaintDate(Date lastMaintDate) {
        this.lastMaintDate = lastMaintDate;
    }

    public Date getNextMaintDate() {
        return nextMaintDate;
    }

    public void setNextMaintDate(Date nextMaintDate) {
        this.nextMaintDate = nextMaintDate;
    }
    
    public void setNextMaintDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(lastMaintDate);
        calendar.add(Calendar.DATE, maintInterval);
        nextMaintDate = calendar.getTime();
    }

    public UserAccount getVender() {
        return vender;
    }

    public void setVender(UserAccount vender) {
        this.vender = vender;
    }

    public String getProblemDesp() {
        return problemDesp;
    }

    public void setProblemDesp(String problemDesp) {
        if(mType.equals(MaintType.REG)){
            this.problemDesp = "Regular Maintenance";
        }else{
            this.problemDesp = problemDesp;
        }
    }

    public String getFixDesp() {
        return fixDesp;
    }

    public void setFixDesp(String fixDesp) {
        if(mType.equals(MaintType.REG)){
            this.fixDesp = "Regular Maintenance";
        }else{
            this.fixDesp = fixDesp;
        }
    }

    public MaintType getmType() {
        return mType;
    }

    public void setmType(MaintType mType) {
        this.mType = mType;
    }
    
    
}
