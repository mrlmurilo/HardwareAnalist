package com.murilo.hardwareanalist;

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

    public void setIdPc(Integer idPc) {
        this.idPc = idPc;
    }

    public String getNomePc() {
        return nomePc;
    }

    public void setNomePc() {
        String hostname = "Unknown";

        try {
            InetAddress addr;
            addr = InetAddress.getLocalHost();
            hostname = addr.getHostName();
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        this.nomePc = hostname;
    }

    public String getIpPc() {
        return ipPc;
    }

    public void setIpPc() {
        String ipPc = "Unknow";

        try {
            InetAddress addr;
            addr = InetAddress.getLocalHost();
            ipPc = addr.getHostAddress();
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        this.ipPc = ipPc;
    }

    public String getSoPc() {
        return soPc;
    }

    public void setSoPc(String soPc) {
        this.soPc = soPc;
    }

    public String getVersaoSO() {
        return versaoSO;
    }

    public void setVersaoSO(String versaoSO) {
        this.versaoSO = versaoSO;
    }

    public String getMemoriaPc() {
        return memoriaPc;
    }

    public void setMemoriaPc(String memoriaPc) {
        this.memoriaPc = memoriaPc;
    }
}
