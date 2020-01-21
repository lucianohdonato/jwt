import { UsuarioService } from './../../service/usuario/usuario.service';
import { Component, OnInit } from '@angular/core';
import { Usuario } from 'src/app/model/Usuario';
import { Router } from '@angular/router';
import { Token } from 'src/app/model/Token';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  usuario: Usuario = new Usuario();
  constructor(private usuarioService: UsuarioService, private router: Router) { }

  ngOnInit() {
  }

  public enviarDados(){
    console.log(this.usuario);
    this.usuarioService.autenticate(this.usuario).subscribe(
      (res: Token)=>{
        localStorage.setItem("token",res.token);
        console.log(res);
        this.router.navigate(["/lista"]);
        console.log()
      },
      (err)=>{
        console.log(err);
        alert("ERROOOOOOUUUUU");
      }
    );
 }
}