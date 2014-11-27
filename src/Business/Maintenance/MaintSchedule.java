/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Maintenance;

import Business.UserAccount.UserAccount;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author Martin
 */
public class MaintSchedule {
    
    private int maintInterval;
    private Date lastMaintDate;
    private Date nextMaintDate;
    private UserAccount vender;
    private String problemDesp;
    private String fixDesp;
    private MaintType mType;

    public MaintSchedule(MaintType mtype) {
        this.mType = mtype;
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

    public void setMaintInterval(int maintInterval) {
        this.maintInterval = maintInterval;
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
        this.problemDesp = problemDesp;
    }

    public String getFixDesp() {
        return fixDesp;
    }

    public void setFixDesp(String fixDesp) {
        this.fixDesp = fixDesp;
    }
    
    
    
}
