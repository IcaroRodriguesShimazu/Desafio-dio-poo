package br.com.dio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class BootCamp {

        private String nome;

        private String descricao;

        private final LocalDate datadeinicio = LocalDate.now();

        private final LocalDate datafinal = datadeinicio.plusDays(45);

        private Set<Dev> devInscrito = new HashSet<>();

        private Set<Conteudo> conteudos = new LinkedHashSet<>();

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public LocalDate getDatadeinicio() {
            return datadeinicio;
        }

        public LocalDate getDatafinal() {
            return datafinal;
        }

        public Set<Dev> getDevInscrito() {
            return devInscrito;
        }

        public void setDevInscrito(Set<Dev> devInscrito) {
            this.devInscrito = devInscrito;
        }

        public Set<Conteudo> getConteudos() {
            return conteudos;
        }

        public void setConteudos(Set<Conteudo> conteudos) {
            this.conteudos = conteudos;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((nome == null) ? 0 : nome.hashCode());
            result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
            result = prime * result + ((datadeinicio == null) ? 0 : datadeinicio.hashCode());
            result = prime * result + ((datafinal == null) ? 0 : datafinal.hashCode());
            result = prime * result + ((devInscrito == null) ? 0 : devInscrito.hashCode());
            result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            BootCamp other = (BootCamp) obj;
            if (nome == null) {
                if (other.nome != null)
                    return false;
            } else if (!nome.equals(other.nome))
                return false;
            if (descricao == null) {
                if (other.descricao != null)
                    return false;
            } else if (!descricao.equals(other.descricao))
                return false;
            if (datadeinicio == null) {
                if (other.datadeinicio != null)
                    return false;
            } else if (!datadeinicio.equals(other.datadeinicio))
                return false;
            if (datafinal == null) {
                if (other.datafinal != null)
                    return false;
            } else if (!datafinal.equals(other.datafinal))
                return false;
            if (devInscrito == null) {
                if (other.devInscrito != null)
                    return false;
            } else if (!devInscrito.equals(other.devInscrito))
                return false;
            if (conteudos == null) {
                if (other.conteudos != null)
                    return false;
            } else if (!conteudos.equals(other.conteudos))
                return false;
            return true;
        }

        

} 
