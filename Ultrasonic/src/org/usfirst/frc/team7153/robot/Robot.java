package org.usfirst.frc.team7153.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Ultrasonic;

public class Robot extends TimedRobot {

	Ultrasonic ultra = new Ultrasonic(1,1); // creates the ultra object andassigns ultra to be an ultrasonic sensor which uses DigitalOutput 1 for 
        // the echo pulse and DigitalInput 1 for the trigger pulse
    public void robotInit() {
    	ultra.setAutomaticMode(true); // turns on automatic mode
    }

    public void ultrasonicSample() {
    	double range = ultra.getRangeInches(); // reads the range on the ultrasonic sensor
    }
}