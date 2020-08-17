package dao.personne;

import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;

import Models.Personne;

public class daopersonne {
	
	private Connixion con = new Connixion();
	
	public int suppersonne (int id) throws Exception {
		con.connect();
		int res = con.Maj("delet from personne where id ="+id);
		con.disconnect();
		return res ; 
		
	}
	public int ajouterpersonne(Personne p ) throws Exception {
		con.connect();
		int res = con.Maj("insert into personne( login , nom,  prenom,  adresse,  password) values ('"+p.getLogin()+"','"+p.getNom()+"','"+p.getPrenom()+"','"+p.getAdresse()+"','"+p.getPassword()+"')");
		con.disconnect();
		return res ; 
		
	}
	public int modifierpersonne (Personne p) throws Exception {
		con.connect();
		int res = con.Maj("update personne set  login = '"+p.getLogin()+"', nom = '"+p.getNom()+"', prenom = '"+p.getPrenom()+"', adresse = '"+p.getAdresse()+"', password = '"+p.getPassword()+"'");
		con.disconnect();
		return res ; 
		
	}
	public ArrayList<Personne> afficherpersonne () throws Exception{
		ArrayList<Personne> personnes = new ArrayList<Personne>();
		Personne p = null ;
		con.connect();
		ResultSet res = (ResultSet) con.select("select * from personne");
		while (res.next()) {
			p = new Personne( res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6) );
			personnes.add(p);
		}
		con.disconnect();
		return personnes;
		
	}
}
