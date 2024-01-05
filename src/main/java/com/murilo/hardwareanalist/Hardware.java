package com.murilo.hardwareanalist;

import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * @author Murilo
 */
public class Hardware {

    private int idPc;
    private String nomePc;
    private String ipPc;
    private String soPc;
    private String versaoSO;
    private String memoriaPc;

    public Integer getIdPc() {
        return idPc;
    }

    public String getNomePc() {

        String hostname = "Unknown";

        try {
            InetAddress addr;
            addr = InetAddress.getLocalHost();
            hostname = addr.getHostName();
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        return hostname;
    }

    public String getIpPc() {
        String ipPc = "Unknow";

        try {
            InetAddress addr;
            addr = InetAddress.getLocalHost();
            ipPc = addr.getHostAddress();
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        return ipPc;
    }

    public String getSoPc() {
        String soPC = System.getProperty("os.name");
        return soPC;
    }

    public String getVersaoSO() {
        String versaoSO = System.getProperty("os.version");
        return versaoSO;
    }

    public String getMemoriaPc() {
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        long totalMemorySize = osBean.getTotalPhysicalMemorySize();
        double totalMemoryGb = totalMemorySize / Math.pow(1024, 3);
        System.out.printf("Memória RAM Total: %.2f GB%n", totalMemoryGb);
        String memoriaPc = Double.toString(totalMemoryGb);
        return memoriaPc;
    }
}
