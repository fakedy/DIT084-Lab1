import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;





public class WorkScheduleTest {

    WorkSchedule workSchedule;

    @BeforeEach
    void setUp() {
        workSchedule = new WorkSchedule(24);
    }

    @Test
    void employeesabove0(){

        workSchedule.setRequiredNumber(10,0,10);
        for (int i = 0; i < 10; i++){
            assertEquals(10, workSchedule.readSchedule(i).requiredNumber);
        }
    }

    @Test
    void startTimeabove0(){
        int starttime = 11;
        int endtime = 15;
        workSchedule.setRequiredNumber(5,starttime,endtime);
        for (int i = starttime; i < endtime; i++){
            assertEquals(5, workSchedule.readSchedule(i).requiredNumber);
        }
    }
    @Test
    void endTimeabove0(){
        int starttime = 11;
        int endtime = 15;
        workSchedule.setRequiredNumber(6,starttime,endtime);
        for (int i = starttime; i < endtime; i++){
            assertEquals(6, workSchedule.readSchedule(i).requiredNumber);
        }
    }

    @Test
    void starttimeGreaterThanEndTime(){
        int starttime = 16;
        int endtime = 12;
        workSchedule.setRequiredNumber(6,starttime,endtime);
        assertEquals(0, workSchedule.readSchedule(16).requiredNumber);

    }

    @Test
    void starttimeLesserThanEndTime(){
        int starttime = 11;
        int endtime = 15;
        workSchedule.setRequiredNumber(20,starttime,endtime);
        assertEquals(20, workSchedule.readSchedule(11).requiredNumber);

    }



}
