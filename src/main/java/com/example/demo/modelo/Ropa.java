package com.example.demo.modelo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@Table(name = "Ropa")
@Entity

public class Ropa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRopa;
	private String tipoRopa;
	private String descripcion;
	
	
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(
		name="ropa_lavadora",
		joinColumns =
			@JoinColumn(
					name="id_ropa", 
					nullable = false, 
					unique = true, 
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_ropa) references Ropa (id_ropa)")),
			
		inverseJoinColumns = 
			@JoinColumn(
					name="id_lavadora", 
					nullable = false, 
					unique = true, 
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_lavadora) references Lavadora (id_lavadora)"))
	)
	private List<Lavadora> lavadora = new ArrayList<>();
	
	
	public Integer getIdRopa() {
		return idRopa;
	}
	public void setIdRopa(Integer idRopa) {
		this.idRopa = idRopa;
	}
	public String getTipoRopa() {
		return tipoRopa;
	}
	public void setTipoRopa(String tipoRopa) {
		this.tipoRopa = tipoRopa;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	

}
