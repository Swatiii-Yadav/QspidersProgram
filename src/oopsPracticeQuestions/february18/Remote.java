package oopsPracticeQuestions.february18;

interface Remote {
    boolean turnOn();

    boolean turnOff();

    int VolumeUp();

    int VolumeDown();
}

class OperateRemote implements Remote {
    boolean isOn=false;
    int vol = 6;

    @Override
    public boolean turnOn() {
        if (!isOn){
            isOn=true;
            return  true;
        }
        return false;
    }

    @Override
    public boolean turnOff() {
        if (isOn){
            isOn=true;
            return  true;
        }
        return false;
    }

    @Override
    public int VolumeUp() {
        if (isOn && vol < 100) {
            vol++;
            vol++;
        }
        return vol;
    }

    @Override
    public int VolumeDown() {
        if (isOn && vol >0) {
            vol--;
            vol--;
        }
        return vol;
    }
}

