const onFindAll = async () => {
    try{
        const r = await axios.get('/patient')
        console.log(r);
        const tbody = document.querySelector('tbody')
        let html = ''
            r.data.forEach(patient => {
                html += `<tr>
                            <td>${patient.patientid}</td>
                            <td>${patient.name}</td>
                            <td>${patient.birthdate}</td>
                            <td>
                                <button onclick="location.href='/hospital_management/patientupdate.html?patientid=${patient.patientid}'">상세조회</button>
                            </td>
                        </tr>`
            })
            tbody.innerHTML = html;
    }catch(e){console.log(e);}
}
onFindAll();
