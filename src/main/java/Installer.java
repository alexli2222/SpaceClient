import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Installer {
    public static String Path = System.getenv("APPDATA") + File.separator + ".minecraft" + File.separator + "spaceclient";
    public static String modPath = Path + File.separator + "mods";
    public static String packPath = Path + File.separator + "resourcepacks";
    public static String savesPath = Path + File.separator + "saves";
    public static String ssPath = Path + File.separator + "screenshots";
    public static String shadersPath = Path + File.separator + "shaderpacks";
    public static String tpackPath = Path + File.separator + "texturepacks";
    public static void Install() {
        File modFolder = new File(modPath);
        if (modFolder.exists()) {
            System.out.println("Found spaceclient mods folder, proceeding...");
        } else {
            System.out.println("Could not find spaceclient mods folder, attempting to create said directory...");
            if (modFolder.mkdirs()) {
                System.out.println("Folder created.");
            } else {
                System.out.println("Directory creation failed.");
            }
        }
        if (Window.NEU.isSelected()) {
            downloadMod("NotEnoughUpdates");
        }
        if (Window.SBA.isSelected()) {
            downloadMod("SkyblockAddons");
        }
        if (Window.ST.isSelected()) {
            downloadMod("Skytils");
        }
        if (Window.Apec.isSelected()) {
            downloadMod("Apec");
        }
        if (Window.DSM.isSelected()) {
            downloadMod("DankersSkyblockMod");
        }
        if (Window.DRM.isSelected()) {
            downloadMod("DungeonRoomsMod");
        }
        if (Window.Syn.isSelected()) {
            downloadMod("Synthesis");
        }
        if (Window.Cow.isSelected()) {
            downloadMod("Cowlection");
        }
        if (Window.COFL.isSelected()) {
            downloadMod("Coflnet");
        }
        if (Window.Opt.isSelected()) {
            downloadMod("Optifine");
            if (new File(shadersPath).exists()) {
                System.out.println("Found Optifine shaderpacks folder, proceeding...");
            } else {
                if (new File(shadersPath).mkdirs()) {
                    System.out.println("Created Optifine shaderpacks folder, proceeding...");
                } else {
                    System.out.println("Failed to create Optifine shaderpacks folder.");
                }
            }
        }
        if (Window.Pat.isSelected()) {
            downloadMod("Patcher");
        }
        if (Window.Dulk.isSelected()) {
            if (new File(modPath + File.separator + "OldAnimations.jar").exists()) {
                System.out.println("Found incompatibility: DulkirMod & OldAnimations, deleting OldAnimations.jar...");
                if (new File(modPath + File.separator + "OldAnimations.jar").delete()) {
                    System.out.println("Successfully deleted OldAnimations.jar.");
                } else {
                    System.out.println("Failed to delete OldAnimations.jar, please manually delete as otherwise there might be an issue.");
                }
            }
            downloadMod("DulkirMod");
        }
        if (Window.OA.isSelected()) {
            if (new File(modPath + File.separator + "DulkirMod.jar").exists()) {
                System.out.println("Found incompatibility: OldAnimations & DulkirMod, deleting DulkirMod.jar...");
                if (new File(modPath + File.separator + "DulkirMod.jar").delete()) {
                    System.out.println("Successfully deleted DulkirMod.jar.");
                } else {
                    System.out.println("Failed to delete DulkirMod.jar, please manually delete as otherwise there might be an issue.");
                }
            }
            downloadMod("OldAnimations");
        }
        if (Window.CP.isSelected()) {
            downloadMod("CrashPatch");
        }
        if (Window.MB.isSelected()) {
            downloadMod("MotionBlur");
        }
        if (Window.TS.isSelected()) {
            downloadMod("ToggleSprint");
        }
        downloadMC();
    }

    public static void downloadMod(String mod) {
        File modfile = new File(modPath + File.separator + mod + ".jar");
        if (!modfile.exists()) {
            System.out.println("Downloading " + mod + ".jar...");
            try {
                URL url = new URL("https://github.com/xDm8/SpaceClientReferences/raw/main/mods/" + mod + ".jar");
                InputStream input = url.openStream();
                FileOutputStream output = new FileOutputStream(modfile);
                byte[] bytes = new byte[1024];
                int len;
                while ((len = input.read(bytes)) != -1) {
                    output.write(bytes, 0, len);
                }
                output.close();
                input.close();
                System.out.println("Successfully downloaded " + mod + ".jar.");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Download for " + mod + ".jar failed.");
            }
        } else {
            System.out.println(mod + " already exists, skipping...");
        }
    }
    public static void downloadMC() {
        if (new File(packPath).exists()) {
            System.out.println("Found resourcepacks folder, proceeding...");
        } else {
            if (new File(packPath).mkdirs()) {
                System.out.println("Created resourcepacks folder, proceeding...");
            } else {
                System.out.println("Failed to create resourcepacks folder.");
            }
        }
        if (new File(savesPath).exists()) {
            System.out.println("Found saves folder, proceeding...");
        } else {
            if (new File(savesPath).mkdirs()) {
                System.out.println("Created saves folder, proceeding...");
            } else {
                System.out.println("Failed to create saves folder.");
            }
        }
        if (new File(ssPath).exists()) {
            System.out.println("Found screenshots folder, proceeding...");
        } else {
            if (new File(ssPath).mkdirs()) {
                System.out.println("Created screenshots folder, proceeding...");
            } else {
                System.out.println("Failed to create screenshots folder.");
            }
        }
        if (new File(tpackPath).exists()) {
            System.out.println("Found texturepacks folder, proceeding...");
        } else {
            if (new File(tpackPath).mkdirs()) {
                System.out.println("Created texturepacks folder, proceeding...");
            } else {
                System.out.println("Failed to create texturepacks folder.");
            }
        }
        System.out.println("Installation complete, exiting.");
        Main.ConsoleCommandRunner("app.exit");
    }
}
