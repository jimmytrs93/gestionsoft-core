package gestion;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the colaborador database table.
 * 
 */
@Entity
@Table(name="colaborador")
@NamedQuery(name="Colaborador.findAll", query="SELECT c FROM Colaborador c")
public class Colaborador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="colaborador_id")
	private int colaboradorId;

	private String cargo;

	private String documento;

	private String email;

	private byte estado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_desvinculacion")
	private Date fechaDesvinculacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_vinculacion")
	private Date fechaVinculacion;

	private String nombre;

	private String telefono;

	//bi-directional many-to-one association to Negocio
	@ManyToOne
	@JoinColumn(name="negocio_id")
	private Negocio negocio;

	//bi-directional many-to-one association to Registro
	@OneToMany(mappedBy="colaborador")
	private List<Registro> registros;

	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="colaborador")
	private List<Reserva> reservas;

	public Colaborador() {
	}

	public int getColaboradorId() {
		return this.colaboradorId;
	}

	public void setColaboradorId(int colaboradorId) {
		this.colaboradorId = colaboradorId;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getEstado() {
		return this.estado;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	public Date getFechaDesvinculacion() {
		return this.fechaDesvinculacion;
	}

	public void setFechaDesvinculacion(Date fechaDesvinculacion) {
		this.fechaDesvinculacion = fechaDesvinculacion;
	}

	public Date getFechaVinculacion() {
		return this.fechaVinculacion;
	}

	public void setFechaVinculacion(Date fechaVinculacion) {
		this.fechaVinculacion = fechaVinculacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Negocio getNegocio() {
		return this.negocio;
	}

	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}

	public List<Registro> getRegistros() {
		return this.registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}

	public Registro addRegistro(Registro registro) {
		getRegistros().add(registro);
		registro.setColaborador(this);

		return registro;
	}

	public Registro removeRegistro(Registro registro) {
		getRegistros().remove(registro);
		registro.setColaborador(null);

		return registro;
	}

	public List<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Reserva addReserva(Reserva reserva) {
		getReservas().add(reserva);
		reserva.setColaborador(this);

		return reserva;
	}

	public Reserva removeReserva(Reserva reserva) {
		getReservas().remove(reserva);
		reserva.setColaborador(null);

		return reserva;
	}

}