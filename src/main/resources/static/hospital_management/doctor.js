const onFindAll = async () => {
    try{
        const r = await axios.get('/doctor')
        console.log(r);
        const tbody = document.querySelector('tbody')
        let html = ''
            r.data.forEach(doctor => {
                html += `<tr>
                            <td>${doctor.doctorid}</td>
                            <td>${doctor.name}</td>
                            <td>${doctor.specialty}</td>
                            <td>
                                <button onclick="location.href='/hospital_management/doctorupdate.html?doctorid=${doctor.doctorid}'">상세조회</button>
                            </td>
                        </tr>`
            })
            tbody.innerHTML = html;
    }catch(e){console.log(e);}
}
onFindAll();