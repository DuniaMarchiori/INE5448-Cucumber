package br.ufsc.entity;

import java.io.Serializable;

public final class TipoVPNI implements Serializable{
	
	public static final int VPNI_10 = 10;
	public static final int VPNI_20 = 20;
	public static final int VPNI_30 = 30;
	public static final int VPNI_40 = 40;
	public static final int VPNI_50 = 50;
	public static final int VPNI_60 = 60;
	public static final int VPNI_70 = 70;
	public static final int VPNI_80 = 80;
	public static final int VPNI_90 = 90;
	public static final int VPNI_100 = 100;
	
	public TipoVPNI(int pcMaximoVPNI) {
		this.setPcMaximoVPNI(pcMaximoVPNI);
	}
	private int pcMaximoVPNI = 0;
	
	public static final int getProximoTipo(int tipoAtual) {
		int tipo = 10;
		switch(tipoAtual) {
		case 10:
			tipo = 20;
			break;
		case 20:
			tipo = 30;
			break;
		case 30:
			tipo = 40;
			break;
		case 40:
			tipo = 50;
			break;
		case 50:
			tipo = 60;
			break;
		case 60:
			tipo = 70;
			break;
		case 70:
			tipo = 80;
			break;
		case 80:
			tipo = 90;
			break;
		case 90:
			tipo = 100;
			break;
		case 100:
			tipo = 0;
			break;
		}
		
		return tipo;
	}

	public int getPcMaximoVPNI() {
		return pcMaximoVPNI;
	}

	public void setPcMaximoVPNI(int tipoVPNI) {
		this.pcMaximoVPNI = tipoVPNI;
	}
	
}
