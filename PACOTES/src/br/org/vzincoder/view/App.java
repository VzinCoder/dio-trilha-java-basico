package br.org.vzincoder.view;

import br.org.vzincoder.exception.NoPeopleRegisteredException;
import br.org.vzincoder.exception.PersonAlreadyRegisteredException;
import br.org.vzincoder.exception.PersonNotFoundException;
import br.org.vzincoder.model.Person;
import br.org.vzincoder.repository.PersonRepository;
import br.org.vzincoder.service.PersonService;

import javax.naming.LimitExceededException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        PersonRepository personRepository = new PersonRepository();
        PersonService personService = new PersonService(personRepository);
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("1. Adicionar pessoa");
            System.out.println("2. Listar pessoas");
            System.out.println("3. Buscar pessoa por codigo");
            System.out.println("4. Alterar pessoa");
            System.out.println("5. Excluir pessoa");
            System.out.println("6. Verificar se pessoa esta registrada");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opcao: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Digite o nome da pessoa: ");
                    String name = scanner.nextLine();
                    System.out.print("Digite a idade da pessoa: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha
                    System.out.print("Digite o codigo da pessoa: ");
                    String cod = scanner.nextLine();

                    Person person = new Person();
                    person.name = name;
                    person.age = age;
                    person.cod = cod;

                    try {
                        personService.addPerson(person);
                        System.out.println("Pessoa adicionada com sucesso!");
                    } catch (LimitExceededException e) {
                        System.out.println("Limite de pessoas excedido. Nao foi possivel adicionar.");
                    }catch(PersonAlreadyRegisteredException e){
                        System.out.println("Ja tem uma pessoa cadastrada com esse codigo!.");
                    }
                    break;
                case 2:
                    try {
                        Person[] people = personService.getPeople();
                        System.out.println("Pessoas cadastradas:");
                        for (Person p : people) {
                            System.out.println("Nome: " + p.name + ", Idade: " + p.age + ", Codigo: " + p.cod);
                        }
                    } catch (NoPeopleRegisteredException e) {
                        System.out.println("Nenhuma pessoa registrada.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o codigo da pessoa: ");
                    String searchCod = scanner.nextLine();
                    try {
                        Person foundPerson = personService.findPerson(searchCod);
                        System.out.println(
                                "Pessoa encontrada: Nome: " + foundPerson.name + ", Idade: " + foundPerson.age);
                    } catch (PersonNotFoundException e) {
                        System.out.println("Pessoa nao encontrada.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o codigo da pessoa que deseja alterar: ");
                    String code = scanner.nextLine();

                    System.out.print("Digite o novo nome da pessoa: ");
                    String newName = scanner.nextLine();
                    System.out.print("Digite a nova idade da pessoa: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();

                    Person alteredPerson = new Person();
                    alteredPerson.name = newName;
                    alteredPerson.age = newAge;
                    alteredPerson.cod = code;

                    try {
                        personService.alterPerson(alteredPerson);
                        System.out.println("Pessoa alterada com sucesso!");
                    } catch (PersonNotFoundException e) {
                        System.out.println("Pessoa nao encontrada.");
                    } catch (NoPeopleRegisteredException e) {
                        System.out.println("Nenhuma pessoa registrada.");
                    }
                    break;
                case 5:
                    System.out.print("Digite o codigo da pessoa que deseja excluir: ");
                    String deleteCod = scanner.nextLine();
                    try {
                        personService.deletePerson(deleteCod);
                        System.out.println("Pessoa excluida com sucesso!");
                    } catch (PersonNotFoundException e) {
                        System.out.println("Pessoa nao encontrada.");
                    } catch (NoPeopleRegisteredException e) {
                        System.out.println("Nenhuma pessoa registrada.");
                    }
                    break;
                case 6:
                    System.out.print("Digite o codigo da pessoa para verificar se esta registrada: ");
                    String checkCod = scanner.nextLine();
                    if (personService.isPersonRegistered(checkCod)) {
                        System.out.println("Pessoa esta registrada.");
                    } else {
                        System.out.println("Pessoa nao esta registrada.");
                    }
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opcao invalida. Por favor, escolha uma opcao valida.");
            }

            System.out.println();
        } while (option != 7);

        scanner.close();
    }
}
