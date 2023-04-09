import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

public class Window extends JFrame {
    static JFrame frame = new JFrame();
    static JLabel Title = new JLabel("SpaceClient");
    static JLabel Mods = new JLabel("Mods");
    static JLabel QOL= new JLabel("QOL");
    //Extras
    static JLabel Apo1= new JLabel("*Not compatible with each other");
    //SB section
    static JLabel SBSection = new JLabel("Skyblock");
    static JCheckBox NEU = new JCheckBox("NotEnoughUpdates");
    static JCheckBox SBA = new JCheckBox("SkyblockAddons");
    static JCheckBox ST = new JCheckBox("Skytils");
    static JCheckBox Apec = new JCheckBox("Apec");
    static JCheckBox DSM = new JCheckBox("Danker's Skyblock Mod");
    static JCheckBox DRM = new JCheckBox("Dungeon Rooms Mod");
    static JCheckBox Syn = new JCheckBox("Synthesis");
    static JCheckBox Cow = new JCheckBox("Cowlection");
    static JCheckBox COFL = new JCheckBox("Coflnet (Flipping Mod)");
    //QOL section
    static JCheckBox Opt = new JCheckBox("Optifine");
    static JCheckBox Pat = new JCheckBox("Patcher");
    static JCheckBox Dulk = new JCheckBox("Dulkir Mod* (Animations)");
    static JCheckBox OA = new JCheckBox("Old Animations*");
    static JCheckBox CP = new JCheckBox("CrashPatch");
    static JCheckBox MB = new JCheckBox("Motion Blur");
    static JCheckBox TS = new JCheckBox("Toggle Sprint");
    //Install button
    static JButton Install = new JButton("Install");
    public static void Launch() {
        //frame
        frame.setLayout(null);
        frame.setSize(1400,900);
        frame.setResizable(false);
        frame.setTitle("SpaceClient");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.black);
        frame.setVisible(true);
        //---CONTENT---
        //Title
        Title.setForeground(Color.white);
        Title.setFont(new Font("MV Boli",Font.BOLD,70));
        Title.setBounds(0,-50,800,200);
        Title.setVisible(true);
        frame.add(Title);
        //--Mods--
        Mods.setForeground(Color.white);
        Mods.setFont(new Font("MV Boli",Font.BOLD,50));
        Mods.setBounds(300,100,150,150);
        Mods.setVisible(true);
        frame.add(Mods);
        //-Mod Section (Skyblock)-
        SBSection.setForeground(Color.white);
        SBSection.setFont(new Font("MV Boli",Font.BOLD,30));
        SBSection.setBounds(30,150,150,150);
        SBSection.setVisible(true);
        frame.add(SBSection);
        //NEU
        NEU.setBounds(0,250,250,25);
        NEU.setBackground(Color.black);
        NEU.setForeground(Color.white);
        NEU.setFocusable(false);
        NEU.setFont(new Font("MV Boli",Font.BOLD,20));
        NEU.setVisible(true);
        frame.add(NEU);
        //SBA
        SBA.setBounds(0,300,250,25);
        SBA.setBackground(Color.black);
        SBA.setForeground(Color.white);
        SBA.setFocusable(false);
        SBA.setFont(new Font("MV Boli",Font.BOLD,20));
        SBA.setVisible(true);
        frame.add(SBA);
        //ST
        ST.setBounds(0,350,250,25);
        ST.setBackground(Color.black);
        ST.setForeground(Color.white);
        ST.setFocusable(false);
        ST.setFont(new Font("MV Boli",Font.BOLD,20));
        ST.setVisible(true);
        frame.add(ST);
        //Apec
        Apec.setBounds(0,400,250,25);
        Apec.setBackground(Color.black);
        Apec.setForeground(Color.white);
        Apec.setFocusable(false);
        Apec.setFont(new Font("MV Boli",Font.BOLD,20));
        Apec.setVisible(true);
        frame.add(Apec);
        //DSM
        DSM.setBounds(0,450,400,25);
        DSM.setBackground(Color.black);
        DSM.setForeground(Color.white);
        DSM.setFocusable(false);
        DSM.setFont(new Font("MV Boli",Font.BOLD,20));
        DSM.setVisible(true);
        frame.add(DSM);
        //DRM
        DRM.setBounds(0,500,400,25);
        DRM.setBackground(Color.black);
        DRM.setForeground(Color.white);
        DRM.setFocusable(false);
        DRM.setFont(new Font("MV Boli",Font.BOLD,20));
        DRM.setVisible(true);
        frame.add(DRM);
        //Synthesis
        Syn.setBounds(0,550,250,25);
        Syn.setBackground(Color.black);
        Syn.setForeground(Color.white);
        Syn.setFocusable(false);
        Syn.setFont(new Font("MV Boli",Font.BOLD,20));
        Syn.setVisible(true);
        frame.add(Syn);
        //Cowlection
        Cow.setBounds(0,600,250,25);
        Cow.setBackground(Color.black);
        Cow.setForeground(Color.white);
        Cow.setFocusable(false);
        Cow.setFont(new Font("MV Boli",Font.BOLD,20));
        Cow.setVisible(true);
        frame.add(Cow);
        //COFL
        COFL.setBounds(0,650,400,25);
        COFL.setBackground(Color.black);
        COFL.setForeground(Color.white);
        COFL.setFocusable(false);
        COFL.setFont(new Font("MV Boli",Font.BOLD,20));
        COFL.setVisible(true);
        frame.add(COFL);
        //-Mod Section (QOL)-
        QOL.setForeground(Color.white);
        QOL.setFont(new Font("MV Boli",Font.BOLD,30));
        QOL.setBounds(580,150,150,150);
        QOL.setVisible(true);
        frame.add(QOL);
        //Optifine
        Opt.setBounds(550,250,250,25);
        Opt.setBackground(Color.black);
        Opt.setForeground(Color.white);
        Opt.setFocusable(false);
        Opt.setFont(new Font("MV Boli",Font.BOLD,20));
        Opt.setVisible(true);
        frame.add(Opt);
        //Patcher
        Pat.setBounds(550,300,250,25);
        Pat.setBackground(Color.black);
        Pat.setForeground(Color.white);
        Pat.setFocusable(false);
        Pat.setFont(new Font("MV Boli",Font.BOLD,20));
        Pat.setVisible(true);
        frame.add(Pat);
        //Dulkir
        Dulk.setBounds(550,350,350,25);
        Dulk.setBackground(Color.black);
        Dulk.setForeground(Color.white);
        Dulk.setFocusable(false);
        Dulk.setFont(new Font("MV Boli",Font.BOLD,20));
        Dulk.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                OA.setSelected(false);
            }
        });
        Dulk.setVisible(true);
        frame.add(Dulk);
        //OldAnimations
        OA.setBounds(550,400,250,25);
        OA.setBackground(Color.black);
        OA.setForeground(Color.white);
        OA.setFocusable(false);
        OA.setFont(new Font("MV Boli",Font.BOLD,20));
        OA.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                Dulk.setSelected(false);
            }
        });
        OA.setVisible(true);
        frame.add(OA);
        //CrashPatch
        CP.setBounds(550,450,250,25);
        CP.setBackground(Color.black);
        CP.setForeground(Color.white);
        CP.setFocusable(false);
        CP.setFont(new Font("MV Boli",Font.BOLD,20));
        CP.setVisible(true);
        frame.add(CP);
        //Motionblur
        MB.setBounds(550,500,250,25);
        MB.setBackground(Color.black);
        MB.setForeground(Color.white);
        MB.setFocusable(false);
        MB.setFont(new Font("MV Boli",Font.BOLD,20));
        MB.setVisible(true);
        frame.add(MB);
        //Togglesprint
        TS.setBounds(550,550,250,25);
        TS.setBackground(Color.black);
        TS.setForeground(Color.white);
        TS.setFocusable(false);
        TS.setFont(new Font("MV Boli",Font.BOLD,20));
        TS.setVisible(true);
        frame.add(TS);
        //--Extras--
        Apo1.setForeground(Color.white);
        Apo1.setFont(new Font("MV Boli",Font.BOLD,15));
        Apo1.setBounds(850,700,450,150);
        Apo1.setVisible(true);
        frame.add(Apo1);
        //--Install--
        Install.setBounds(0,810,250,50);
        Install.setBackground(Color.black);
        Install.setForeground(Color.white);
        Install.setFocusable(false);
        Install.setFont(new Font("MV Boli",Font.BOLD,20));
        Install.addActionListener(e -> Installer.Install());
        Install.setVisible(true);
        frame.add(Install);
    }
}