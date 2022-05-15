var table =$('<table>');
        table.addClass('table table-striped m-3');
        $('#container').append(table);
        var tbody=$('<tbody>');
        table.append(tbody);

        var requestOptions = {method:'GET',redirect:'follow'};
        fetch("http://127.0.0.1:8080/books", requestOptions)
        .then(response=>response.json())
        .then(response=>showBook(response));

        function showUsers(response){
            //Zagolovok
            var tr = $('<tr>');
                tbody.append(tr);
                tr.append($('<th>').html('Фамилия'));
                tr.append($('<th>').html('Имя'));
                tr.append($('<th>').html('Отчество'));

                //Data
            for (let i=0; i<response.length; i++){
                var tr = $('<tr>');
                tbody.append(tr);
                var id = response[i].id;
                var surname = $('<td>').html(response[i].surname);
                var name = $('<td>').html(response[i].name);
                var patronymic = $('<td>').html(response[i].patronymic);
                    tr.append(surname);
                    tr.append(name);
                    tr.append(patronymic);
                            
                            tbody.append(tr);
                    }
        }