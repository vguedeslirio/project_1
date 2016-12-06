<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="rich" uri="http://richfaces.org/rich" %>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><title>Cadastrar Veículo</title></head>
	<body>
		<f:view>
			<h:form>
				<h:panelGroup>
					<f:facet name="header">Insira os Dados:</f:facet>
					<h:panelGrid columns="2">
						<h:outputLabel value="Tipo do Veículo" />
						<h:inputText value="#{veiculoControle.tipo}" />
						<h:outputLabel value="Modelo" />
						<h:inputText value="#{veiculoControle.modelo}" size="40" />
						<h:outputLabel value="Cor" />
						<h:inputText value="#{veiculoControle.cor}" size="40" />
						<h:outputLabel value="Preço" />
						<h:inputText value="#{veiculoControle.preco}" />
						<h:commandButton action="#{veiculoControle.exibirDados}" value="Salvar" />
					</h:panelGrid>
				</h:panelGroup>
			</h:form>
		</f:view>
	</body>
</html>