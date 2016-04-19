package SafeHome;

/**
 *
 * @author Tunde
 */
public class SHSController {

	private int SystemID;
	private int VerficationPhoneNumber;
	private int SystemStatus;
	private int delayTime;
	private int telephoneNumber;

    public int getSystemID() {
        return SystemID;
    }

    public void setSystemID(int SystemID) {
        this.SystemID = SystemID;
    }

    public int getVerficationPhoneNumber() {
        return VerficationPhoneNumber;
    }

    public void setVerficationPhoneNumber(int VerficationPhoneNumber) {
        this.VerficationPhoneNumber = VerficationPhoneNumber;
    }

    public int getSystemStatus() {
        return SystemStatus;
    }

    public void setSystemStatus(int SystemStatus) {
        this.SystemStatus = SystemStatus;
    }

    public int getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(int delayTime) {
        this.delayTime = delayTime;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getMasterPassword() {
        return masterPassword;
    }

    public void setMasterPassword(int masterPassword) {
        this.masterPassword = masterPassword;
    }

    public int getTemporaryPassword() {
        return temporaryPassword;
    }

    public void setTemporaryPassword(int temporaryPassword) {
        this.temporaryPassword = temporaryPassword;
    }

    public int getNumberTries() {
        return numberTries;
    }

    public void setNumberTries(int numberTries) {
        this.numberTries = numberTries;
    }
	private int masterPassword;
	private int temporaryPassword;
	private int numberTries;

    /**
     *
     */
    public void program() {
		// TODO - implement SHSController.program
		throw new UnsupportedOperationException();
	}

    /**
     *
     */
    public void display() {
		// TODO - implement SHSController.display
		throw new UnsupportedOperationException();
	}

    /**
     *
     */
    public void reset() {
		// TODO - implement SHSController.reset
		throw new UnsupportedOperationException();
	}

    /**
     *
     */
    public void query() {
		// TODO - implement SHSController.query
		throw new UnsupportedOperationException();
	}

    /**
     *
     */
    public void arm() {
		// TODO - implement SHSController.arm
		throw new UnsupportedOperationException();
	}

    /**
     *
     */
    public void disarm() {
		// TODO - implement SHSController.disarm
		throw new UnsupportedOperationException();
	}

}