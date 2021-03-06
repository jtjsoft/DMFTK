package forensic.command;

import forensic.main.ExecReader;
import forensic.main.Task;
import forensic.main.Cmd;

import java.util.List;

public class GenerateCore extends Cmd {
    private String output = "";
    private List<Integer> _pid = Task.getList();

    public GenerateCore() {
        super();
        super.setCommand("generate-core");
        super.setInstruction("모든 프로세스들에 대한 코어 파일을 생성합니다.");
    }
    
    public void doing() {
        for(Integer pid : _pid){
            output = ExecReader.read("sudo gcore -o ./DumpedFiles/dmftk_dump.pid_is "+pid);
            if(output.contains("Saved corefile"))
                System.out.println("[ PID : " + pid + " ] Core file core.\npid : [ " + pid + " ] generated");
            else
                System.out.println("[ PID : " + pid + " ] mFailed to create file");
        }
    }
}